package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.TeacherSchedule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbTeacherScheduleMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTeacherScheduleMarshaller.class);
    /*
    Need to fix this before moving on.
     */

     /*
    public static void main(String[] args) {
       TeacherSchedule teacherSchedule = new TeacherSchedule();
       jaxbObjectToXML(teacherSchedule);
    }
     */

    /*
    public static void jaxbObjectToXML(TeacherSchedule teacherSchedule) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherSchedule.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherSchedule, new File("teacherSchedule.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }

     */
}
