package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.DaoFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.LecturerDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl.LecturerDaoImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.LecturerDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.LecturerEntity;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.LecturerService;
import java.util.ArrayList;

public class LecturerServiceImpl implements LecturerService{
    private LecturerDao lecturerDao = (LecturerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.LECTURER);

    @Override
    public String saveLecturer(LecturerDto lecturerDto) throws Exception {
        LecturerEntity lecturerEntity = new LecturerEntity(
                lecturerDto.getLecId(),
                lecturerDto.getLecName(),lecturerDto.getDob(),
                lecturerDto.getAddress(),
                lecturerDto.getCourse());

        return lecturerDao.save(lecturerEntity)? "Success" : "Fail";

    }

    @Override
    public String updateLecturer(LecturerDto lecturerDto) throws Exception {
        LecturerEntity lecturerEntity = new LecturerEntity(
                lecturerDto.getLecId(),
                lecturerDto.getLecName(),lecturerDto.getDob(),
                lecturerDto.getAddress(),
                lecturerDto.getCourse());

        return lecturerDao.update(lecturerEntity)? "Success" : "Fail";
    }

    @Override
    public String deleteLecturer(String code) throws Exception {
        return lecturerDao.delete(code) ? "Success": "Fail";
    }

    @Override
    public LecturerDto searchLecturer(String code) throws Exception {
        LecturerEntity lecturerEntity = lecturerDao.search(code);
        if(lecturerEntity != null) {
            return new LecturerDto(lecturerEntity.getLecId(),
                    lecturerEntity.getLecName(), lecturerEntity.getDob(), lecturerEntity.getAddress(),
                    lecturerEntity.getCourse());
        }
        return null;
    }

    @Override
    public ArrayList<LecturerDto> getAllLecturer() throws Exception {
        ArrayList<LecturerDto> lecturerDtos = new ArrayList<>();

        ArrayList<LecturerEntity> lecturerEntities = lecturerDao.getAll();
        for (LecturerEntity lecturerEntity : lecturerEntities) {
            lecturerDtos.add(new LecturerDto(lecturerEntity.getLecId(), lecturerEntity.getLecName(),
                    lecturerEntity.getDob(), lecturerEntity.getAddress(),
                    lecturerEntity.getCourse()));
        }

        return lecturerDtos;
    }
}
