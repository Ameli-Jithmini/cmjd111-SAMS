package lk.ijse.cmjd111.studentattendencemanagementsystem.controller;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.LecturerDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.ServiceFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.LecturerService;
import java.util.ArrayList;


public class LecturerController {

    private LecturerService lecturerService = (LecturerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.LECTURER);

    public String saveLecturer(LecturerDto lecturerDto) throws Exception{
        return lecturerService.saveLecturer(lecturerDto);
    }

    public String updateLecturer(LecturerDto lecturerDto) throws Exception{
        return lecturerService.updateLecturer(lecturerDto);
    }

    public String deleteLecturer(String code) throws Exception{
        return lecturerService.deleteLecturer(code);
    }

    public LecturerDto searchLecturer(String code) throws Exception{
        return lecturerService.searchLecturer(code);
    }

    public ArrayList<LecturerDto> getAllLecturer() throws Exception{
        return lecturerService.getALlLecturer();
    }
}
