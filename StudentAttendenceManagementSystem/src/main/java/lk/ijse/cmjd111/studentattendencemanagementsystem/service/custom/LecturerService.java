package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.LecturerDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.SuperService;
import java.util.ArrayList;


public interface LecturerService extends SuperService{
    public String saveLecturer(LecturerDto lecturerDto) throws Exception;
    public String updateLecturer(LecturerDto lecturerDto) throws Exception;
    public String deleteLecturer(String code) throws Exception;
    public LecturerDto searchLecturer(String code) throws Exception;
    public ArrayList<LecturerDto> getAllLecturer() throws Exception;
}