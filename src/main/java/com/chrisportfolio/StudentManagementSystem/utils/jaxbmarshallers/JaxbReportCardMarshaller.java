package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.ReportCard;
import com.chrisportfolio.StudentManagementSystem.model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbReportCardMarshaller {

   //Need to rework ERD diagram to include different subjects.

    /*public static void main(String[] args) {
       ReportCard reportCard = new ReportCard(6957668L, new Student(17365429L), "Charlie Brown",
               "Freshman", "Fall", );
       jaxbObjectToXML(reportCard);
    }

     */

     public static void jaxbObjectToXML(ReportCard reportCard) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ReportCard.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(reportCard, new File("reportcard.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
