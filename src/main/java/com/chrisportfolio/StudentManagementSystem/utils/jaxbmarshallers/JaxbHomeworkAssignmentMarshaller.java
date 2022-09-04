package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbHomeworkAssignmentMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbHomeworkAssignmentMarshaller.class);

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXMl(HomeworkAssignment homeworkAssignment) {

        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(HomeworkAssignment.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(homeworkAssignment, new File("homeworkassignment.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}
