package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.Teacher;
import com.chrisportfolio.StudentManagementSystem.model.TeacherLunchBreakRotation;
import com.chrisportfolio.StudentManagementSystem.model.TeacherSchedule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.sql.Time;

public class JaxbTeacherScheduleMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTeacherScheduleMarshaller.class);

    public static void main(String[] args) {
        Time calcOneTimeSlot = new Time(1,30, 0);
        Time teacherLunchBreakOne = new Time(12,30, 0);

       TeacherSchedule teacherSchedule = new TeacherSchedule(278750L, new Teacher(38430931L),
               "Monday, Wednesday, Friday", calcOneTimeSlot, "Calculus 1", new TeacherLunchBreakRotation(859727L),
               teacherLunchBreakOne);
       jaxbObjectToXML(teacherSchedule);
    }



    public static void jaxbObjectToXML(TeacherSchedule teacherSchedule) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherSchedule.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherSchedule, new File("teacherSchedule.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }


}
