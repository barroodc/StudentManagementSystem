package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Department;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbDepartmentMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbDepartmentMarshaller.class);

    public static void main(String[] args) {

        Department department = new Department("MathBuildingA", "Mathematics");
        jaxbObjectToXML(department);
    }

    public static void jaxbObjectToXML(Department department) {

        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Department.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(department, new File("department.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}
