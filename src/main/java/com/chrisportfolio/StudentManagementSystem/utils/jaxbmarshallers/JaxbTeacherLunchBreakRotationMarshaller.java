package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.TeacherLunchBreakRotation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbTeacherLunchBreakRotationMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(TeacherLunchBreakRotation teacherLunchBreakRotation) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherLunchBreakRotation.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherLunchBreakRotation, new File("teacherlunchbreakrotation.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
