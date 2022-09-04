package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class JaxbStudentMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbStudentMarshaller.class);


    //Charlie Brown was already added to mysql database, so I should exclude him from this specific marshaller.
    public static void main(String[] args) {

        Calendar lucyVanPeltBirthday = Calendar.getInstance();
        lucyVanPeltBirthday.set(Calendar.YEAR, 2008);
        lucyVanPeltBirthday.set(Calendar.MONTH, Calendar.APRIL);
        lucyVanPeltBirthday.set(Calendar.DAY_OF_MONTH, 17);
        Date lucyVanPeltBirth = lucyVanPeltBirthday.getTime();



        Calendar lucyVanPeltFirstDayOnCampus = Calendar.getInstance();
        lucyVanPeltFirstDayOnCampus.set(Calendar.YEAR, 2022);
        lucyVanPeltFirstDayOnCampus.set(Calendar.MONTH, Calendar.SEPTEMBER);
        lucyVanPeltFirstDayOnCampus.set(Calendar.DAY_OF_MONTH, 9);
        Date lucyVanPeltFDOC = lucyVanPeltFirstDayOnCampus.getTime();



        Calendar lucyVanPeltLastLoginDate = Calendar.getInstance();
        lucyVanPeltLastLoginDate.set(Calendar.YEAR, 2022);
        lucyVanPeltLastLoginDate.set(Calendar.MONTH, Calendar.JUNE);
        lucyVanPeltLastLoginDate.set(Calendar.DAY_OF_MONTH, 6);
        Date lucyVanPELTLLD = lucyVanPeltLastLoginDate.getTime();



        //Will figure out eventually how to associate last login attempt to automatically update to the database.
        //For now, I will hardcode that information.


        Student student = new Student(38688296L, "lucyvanpelt@gmail.com", "charliesGrief5464",
                "Lucy", "Van Pelt", lucyVanPeltBirth, "3088784008", "2029171639",
                lucyVanPeltFDOC, "Freshman", 0.0, 0, 0, lucyVanPELTLLD, "165.220.147.72");

       jaxbObjectToXML(student);
    }


       public static void jaxbObjectToXML(Student student) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(student, new File("student.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }


}
