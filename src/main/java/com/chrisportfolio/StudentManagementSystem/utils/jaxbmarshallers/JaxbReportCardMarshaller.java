package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.ReportCard;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbReportCardMarshaller {

     /*
    public static void main(String[] args) {
       ReportCard reportCard = new ReportCard();
       jaxbObjectToXML(reportCard);
    }
     */

   /* public static void jaxbObjectToXML(ReportCard reportCard) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ReportCard.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(reportCard, new File("reportcard.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    */
}
