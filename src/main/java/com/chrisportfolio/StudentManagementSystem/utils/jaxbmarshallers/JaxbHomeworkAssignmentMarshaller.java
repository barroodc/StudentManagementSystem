package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignment;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbHomeworkAssignmentMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXMl(HomeworkAssignment homeworkAssignment) {

        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(HomeworkAssignment.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(homeworkAssignment, new File("homeworkassignment.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
