package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.TeacherLunchBreakRotation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbTeacherLunchBreakRotationMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTeacherLunchBreakRotationMarshaller.class);

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(TeacherLunchBreakRotation teacherLunchBreakRotation) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherLunchBreakRotation.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherLunchBreakRotation, new File("teacherlunchbreakrotation.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}
