package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Course;
import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignment;
import com.chrisportfolio.StudentManagementSystem.model.Teacher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class JaxbHomeworkAssignmentMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbHomeworkAssignmentMarshaller.class);

    public static void main(String[] args) {

        Calendar calEventOne = Calendar.getInstance();
        calEventOne.set(Calendar.YEAR, 2022);
        calEventOne.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calEventOne.set(Calendar.DAY_OF_MONTH, 14);
        Date assignedDate = calEventOne.getTime();

        Calendar calEventTwo = Calendar.getInstance();
        calEventTwo.set(Calendar.YEAR, 2022);
        calEventTwo.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calEventOne.set(Calendar.DAY_OF_MONTH, 16);
        Date dueDate = calEventTwo.getTime();

        HomeworkAssignment homeworkAssignment = new HomeworkAssignment(new Teacher(38430931L), "Amaticas",
                "Matt", new Course("Math127"), "Mathematics", "Calculus 1", "Fall 2022", 80368L,
                "Differential Equations", assignedDate, dueDate);

        jaxbObjectToXMl(homeworkAssignment);
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
