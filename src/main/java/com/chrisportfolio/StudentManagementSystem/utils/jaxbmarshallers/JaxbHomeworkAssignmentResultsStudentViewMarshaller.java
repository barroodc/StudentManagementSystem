package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.*;
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

        HomeworkAssignmentResultsStudentView homeworkAssignmentResultsStudentView =
                new HomeworkAssignmentResultsStudentView(663590L, new Student(17365429L), "Brown", "Charlie",
                        new Teacher(38430931L), "Amaticas", "Matt", new Course("Math127"), "Calculus 1",
                        new HomeworkAssignment(80368L), "Differential Equations", 0.0, "n/a", "First assignment on differential equations.");

        jaxbObjectToXML(homeworkAssignmentResultsStudentView);
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
