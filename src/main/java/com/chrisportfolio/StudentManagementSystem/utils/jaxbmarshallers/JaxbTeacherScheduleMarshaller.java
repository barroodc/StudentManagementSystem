package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.TeacherSchedule;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbTeacherScheduleMarshaller {

    public static void jaxbObjectToXML(TeacherSchedule teacherSchedule) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherSchedule.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherSchedule, new File("teacherSchedule.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
