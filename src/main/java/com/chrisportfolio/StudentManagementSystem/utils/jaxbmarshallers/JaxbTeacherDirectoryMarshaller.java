package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Department;
import com.chrisportfolio.StudentManagementSystem.model.Teacher;
import com.chrisportfolio.StudentManagementSystem.model.TeacherDirectory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbTeacherDirectoryMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTeacherDirectoryMarshaller.class);

    public static void main(String[] args) {
        TeacherDirectory teacherDirectory = new TeacherDirectory(854037L, new Teacher(38430931L),
                "Amaticas", "Matt", new Department("MathBuildingA"), "Mathematics", "mattamaticas@gmail.com",
                "8 Peanut Ave, Shorewood, Minnesota, 55331", "6262722483");

        jaxbObjectToXML(teacherDirectory);
    }

    public static void jaxbObjectToXML(TeacherDirectory teacherDirectory) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherDirectory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherDirectory, new File("teacherdirectory.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}
