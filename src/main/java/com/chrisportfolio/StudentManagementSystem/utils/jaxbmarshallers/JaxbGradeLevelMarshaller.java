package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.GradeLevel;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbGradeLevelMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbGradeLevelMarshaller.class);

    public static void main(String[] args) {
       GradeLevel gradeLevel = new GradeLevel(9000L, new Student(17365429L),
               "Charlie Brown", "Newly Enrolled Freshman");
       jaxbObjectToXML(gradeLevel);
    }


    public static void jaxbObjectToXML(GradeLevel gradeLevel) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(GradeLevel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(gradeLevel, new File("gradelevel.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}
