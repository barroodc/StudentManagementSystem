package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.Teacher;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbTeacherMarshaller {

     /*
    public static void main(String[] args) {
       Teacher teacher = new Teacher();
       jaxbObjectToXML(teacher);
    }
     */

   /* public static void jaxbObjectToXML(Teacher teacher) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacher, new File("teacher.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    */
}
