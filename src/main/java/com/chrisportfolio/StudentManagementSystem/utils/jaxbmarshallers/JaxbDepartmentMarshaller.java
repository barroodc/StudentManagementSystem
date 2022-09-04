package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Department;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbDepartmentMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(Department department) {

        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Department.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(department, new File("department.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
