package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbAdmissionsMarshaller {

    /* public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, Calendar.JUNE);
        cal.set(Calendar.DAY_OF_MONTH, 12);
        Date dateRepresentation = cal.getTime();

        Admissions admissions = new Admissions(307912L, new Student(1L), 1L, "Charlie Brown",
                "Freshman", "Approved", dateRepresentation, "n/a");

        jaxbObjectToXML(admissions);
    }

    */

    public static void jaxbObjectToXML(Admissions admissions) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Admissions.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(admissions, new File("admissions.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
