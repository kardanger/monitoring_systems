package com.itmo.diplom;

import com.itmo.diplom.entity.*;
import com.itmo.diplom.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

//Контроллер отображения представлений для отображения состояния системы монтироинга
@Controller
public class SystemController {

    @Autowired
    private CameraTypeRepository cameraTypeRepository;

    @Autowired
    private CompartmentRepository compartmentRepository;

    @Autowired
    private ControlSystemRepository controlSystemRepository;

    @Autowired
    private DecksRepository decksRepository;

    @Autowired
    private SensorsTypeRepository sensorsTypeRepository;

    @Autowired
    private VideoEntityRepository videoEntityRepository;

    @Autowired
    private SensorsRepository sensorsRepository;

    @Autowired
    private CameraRepository cameraRepository;

    //Представление страницы отображения таблицы БД со списком типов камер
    @GetMapping ("/cameras_type")
    public ModelAndView  CamerasTypeView() {
        List<CamerasType> listCamera = (ArrayList<CamerasType>) cameraTypeRepository.findAll();
        ModelAndView mav = new ModelAndView("cameras_type");
        mav.addObject("listCamera", listCamera);
        return mav;
    }
    //Представление страницы отображения таблицы БД со списком отсеков и помещений
    @GetMapping ("/compartment")
    public ModelAndView  CompartmentView() {
        List<Compartment> listCompartment = (ArrayList<Compartment>) compartmentRepository.findAll();
        ModelAndView mav = new ModelAndView("compartment");
        mav.addObject("listCompartment", listCompartment);
        return mav;
    }
    //Представление страницы отображения таблицы БД с типами используемых систем контроля
    @GetMapping ("/control_system")
    public ModelAndView  ControlSystemView() {
        List<ControlSystem> listControlSystem = (ArrayList<ControlSystem>) controlSystemRepository.findAll();
        ModelAndView mav = new ModelAndView("control_system");
        mav.addObject("listControlSystem", listControlSystem);
        return mav;
    }
    //Представление страницы отображения таблицы БД со списком палуб судна
    @GetMapping ("/decks")
    public ModelAndView  decksView() {
        List<Decks> listControlSystem = (ArrayList<Decks>) decksRepository.findAll();
        ModelAndView mav = new ModelAndView("decks");
        mav.addObject("listDecks", listControlSystem);
        return mav;
    }
    //Представление страницы отображения таблицы БД с типами датчиков
    @GetMapping ("/sensors_type")
    public ModelAndView  sensorsTypeView() {
        List<SensorsType> listSystemType = (ArrayList<SensorsType>) sensorsTypeRepository.findAll();
        ModelAndView mav = new ModelAndView("sensors_type");
        mav.addObject("listSensorsType", listSystemType);
        return mav;
    }

    //Представление страницы отображения таблицы БД с информацией видеоархива
    @GetMapping ("/video_entity")
    public ModelAndView  videoEntityView() {
        List<VideoEntity> listVideoEntity = (ArrayList<VideoEntity>) videoEntityRepository.findAll();
        ModelAndView mav = new ModelAndView("video_entity");
        mav.addObject("listVideoEntity", listVideoEntity);
        return mav;
    }

    //Представление страницы отображения таблицы БД с датчиками системы
    @GetMapping ("/sensors")
    public ModelAndView  sensorsView() {
        //TODO Использовать DeckInfoService для получения listSensors
        List<Sensors> listSensors = (ArrayList<Sensors>) sensorsRepository.findAll();
        ModelAndView mav = new ModelAndView("sensors");
        mav.addObject("listSensors", listSensors);
        return mav;
    }
    //Представление страницы отображения таблицы БД с камерами наблюдения
    @GetMapping ("/cameras")
    public ModelAndView  CamerasView() {
        //TODO Использовать DeckInfoService для получения listCameras
        List<Camera> listCameras = (ArrayList<Camera>) cameraRepository.findAll();
        ModelAndView mav = new ModelAndView("cameras");
        mav.addObject("listCameras", listCameras);
        return mav;
    }

    // Основная страница. Представление панели выбора нужного представления таблиц БД
    @GetMapping ("/info")
    public String  infoView() {
        return "info";
    }

    //Представление для выбора просматриваемой палубы и выбора необходимой таблицы с информацией
    // по камерам или датчикам расположенных на палубе
    @GetMapping ("deck")
    public String  testView2(@RequestParam(defaultValue = "1") int id, Model model){
        //TODO Использовать DeckInfoService

        //Заглушка имитирующая бизнес-логику при выборе палубы
        List<Decks> listDecks = (ArrayList<Decks>) decksRepository.findAll();

        List<String> listLink = new ArrayList<>();

        for (Decks deck:
                listDecks) {
            String s = String.valueOf(deck.getId());
            listLink.add("/deck?id=" + s);
            model.addAttribute("link" + s, listLink.get(listLink.size() - 1));
        }

        switch (id){
            case (1): {
                String link_image = "/resources/image/2b40fd31887e6c4140ef935abe29e162.png";
                model.addAttribute("link_prev", listLink.get(0));
                model.addAttribute("link_next", listLink.get(1));
                model.addAttribute("link_image", link_image);
                model.addAttribute("name","Палуба А");
            }
            break;
            case (2): {
                String link_image = "/resources/image/2d097ac5c02d2a3670a7546537e23c66.png";
                model.addAttribute("link_prev", listLink.get(0));
                model.addAttribute("link_next", listLink.get(2));
                model.addAttribute("link_image", link_image);
                model.addAttribute("name","Палуба B");
            }
            break;
            case (3): {
                String link_image = "/resources/image/02aa0871ddba285eab67a995f319332c.png";
                model.addAttribute("link_prev", listLink.get(1));
                model.addAttribute("link_next", listLink.get(2));
                model.addAttribute("link_image", link_image);
                model.addAttribute("name","Палуба C");
            }
            break;
        }
        return "deck";
    }

    //Представление страницы видеоархива
    @GetMapping ("/videoarchive")
    public String  videoarchiveView() {
        //TODO Использовать DeckInfoService
        return "videoarchive";
    }
}