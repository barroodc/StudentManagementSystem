package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignmentResultsStudentView;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbHomeworkAssignmentResultsStudentViewMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(HomeworkAssignmentResultsStudentView homeworkAssignmentResultsStudentView) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(HomeworkAssignmentResultsStudentView.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(homeworkAssignmentResultsStudentView,
                    new File("homeworkassignmentresultsstudentview.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
