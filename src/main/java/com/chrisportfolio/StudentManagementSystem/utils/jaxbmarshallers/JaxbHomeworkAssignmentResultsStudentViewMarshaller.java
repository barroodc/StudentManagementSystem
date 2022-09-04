package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignmentResultsStudentView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbHomeworkAssignmentResultsStudentViewMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbHomeworkAssignmentResultsStudentViewMarshaller.class);

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
            LOGGER.info(e);
        }
    }
}
