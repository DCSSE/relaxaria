package manage.mentalcare.mtc.controllers;

import lombok.RequiredArgsConstructor;
import manage.mentalcare.mtc.model.Patient;
import manage.mentalcare.mtc.repository.PatientRepo;
import manage.mentalcare.mtc.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//@CrossOrigin(origins = "http://localhost:4200")
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("/mt_care/")
//public class PatientController {
//
//    @Autowired
//    private PatientRepo patientReposit;
//    private final PatientService patientService;
//
//    @GetMapping("relaxaria_welcome")
//    public String listPatients ()
////    (Model model,
////                               @RequestParam(defaultValue = "0") int page,
////                               @RequestParam(defaultValue = "7") int size,
////                               @RequestParam(defaultValue = "firstName") String sortBy,
////                               @RequestParam(required = false) String search)
//    {
////        Page<Patient> patientPage;
////
////        if (search != null && !search.isEmpty()) {
////            patientPage = patientReposit.findPatientsByLastNameContainingIgnoreCase(search, PageRequest.of(page, size, Sort.by(sortBy)));
////        } else {
////            patientPage = patientReposit.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
////        }
////        int totalPages = patientPage.getTotalPages();
////        model.addAttribute("patients", patientPage.getContent());
////        model.addAttribute("patientPage", patientPage);
////        int totalPagesMinusOne = totalPages - 1;
////        model.addAttribute("totalPagesMinusOne", totalPagesMinusOne);
////        model.addAttribute("totalPages", patientPage.getTotalPages());
////        model.addAttribute("currentPage", page);
////        model.addAttribute("search", search);
//
//        return "index";
//    }


//    @GetMapping("patient-list")
//    public String listPatients ()
////    (Model model,
////                               @RequestParam(defaultValue = "0") int page,
////                               @RequestParam(defaultValue = "7") int size,
////                               @RequestParam(defaultValue = "firstName") String sortBy,
////                               @RequestParam(required = false) String search)
//    {
////        Page<Patient> patientPage;
////
////        if (search != null && !search.isEmpty()) {
////            patientPage = patientReposit.findPatientsByLastNameContainingIgnoreCase(search, PageRequest.of(page, size, Sort.by(sortBy)));
////        } else {
////            patientPage = patientReposit.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
////        }
////        int totalPages = patientPage.getTotalPages();
////        model.addAttribute("patients", patientPage.getContent());
////        model.addAttribute("patientPage", patientPage);
////        int totalPagesMinusOne = totalPages - 1;
////        model.addAttribute("totalPagesMinusOne", totalPagesMinusOne);
////        model.addAttribute("totalPages", patientPage.getTotalPages());
////        model.addAttribute("currentPage", page);
////        model.addAttribute("search", search);
//
//        return "index";
//    }


//    @Autowired
//    private PatientRepo patientReposit;
//    private final PatientService patientServ;
//
//    // all employees
//    @GetMapping("patient-list")
//    public String showUpdateForm(Model model,
////                                 @RequestParam(defaultValue = "") String search,
//                                 @RequestParam(defaultValue = "0") int page,
//                                 @RequestParam(defaultValue = "7") int size,
//                                 @RequestParam(defaultValue = "firstName") String sortBy,
//                                 @RequestParam(required = false) String search){
//
//        //Page<Employee> employeePage = employeeRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
//        Page<Patient> employeePage;
////        if (search.isEmpty()) {
////            employeePage = employeeRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
////        } else {
////            employeePage = employeeRepository.findByLastNameContainingIgnoreCase(search, PageRequest.of(page, size, Sort.by(sortBy)));
////        }
//        if (search != null && !search.isEmpty()) {
//            employeePage = patientReposit.findByLastNameContainingIgnoreCase(search, PageRequest.of(page, size, Sort.by(sortBy)));
//        } else {
//            employeePage = patientReposit.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
//        }
//        int totalPages = employeePage.getTotalPages();
//        model.addAttribute("employee", employeePage.getContent());
//        model.addAttribute("employeePage", employeePage);
//        int totalPagesMinusOne = totalPages - 1;
//        model.addAttribute("totalPagesMinusOne", totalPagesMinusOne);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("search", search);
//
//        //model.addAttribute("employee", employeeRepository.findAll());
//        return "index";
//    }
//}
