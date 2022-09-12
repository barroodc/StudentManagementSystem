package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Course;
import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignment;
import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignmentResultsTeacherView;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbHomeworkAssignmentResultsTeacherViewMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbHomeworkAssignmentResultsTeacherViewMarshaller.class);

    public static void main(String[] args) {
        HomeworkAssignmentResultsTeacherView homeworkAssignmentResultsTeacherView =
                new HomeworkAssignmentResultsTeacherView(914453L, new Student(17365429L), "Brown", "Charlie",
                        new Course("Math127"), "Calculus 1", new HomeworkAssignment(80368L), "Differential Equations",
                        0.0, "n/a", "First assignment on differential equations.");

        jaxbObjectToXML(homeworkAssignmentResultsTeacherView);
    }

    public static void jaxbObjectToXML(HomeworkAssignmentResultsTeacherView homeworkAssignmentResultsTeacherView) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(HomeworkAssignmentResultsTeacherView.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(homeworkAssignmentResultsTeacherView,
                    new File("homeworkassignmentresultsteacherview.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}
