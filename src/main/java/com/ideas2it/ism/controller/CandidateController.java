package com.ideas2it.ism.controller;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ideas2it.ism.common.Constant;
import com.ideas2it.ism.entity.Candidate;
import com.ideas2it.ism.service.CandidateService;


/**
 * Helps to access candidates informations. Allows recruiters to add new candidate
 * informations, view candidates information to assign to a interviewer. His 
 * complete track is maintained, whether he got selected or rejected or if interview
 * is cancelled. It helps to maintain the whole action performed based on candidiate.
 *  
 * @author M.Mani Bharathi.
 *
 */
@Controller
@Component 
public class CandidateController {
	private CandidateService candidateService;
    //private static final Logger logger = Logger.getLogger(CandidateController.class);
	
    @Autowired
	public CandidateController(CandidateService candidateService) {
		this.candidateService = candidateService;
	}
	
	
    /**
     * When the recruiters needs to add new candidate, this method is called to 
     * show createCandidate page. Where the recruiter can enter the informations 
     * of the candidate and save it.
     * 
     * @param model - Used to send candidate object along with request to jsp.
     * @return CREATE_CANDIDATE_JSP - Page shows the create candidate form to
     * enter the details and to store it.
     */
    @RequestMapping(value = Constant.ADD_CANDIDATE, method = RequestMethod.POST)  
    public String addCandidateForm(Model model) { 
        Candidate candidate = new Candidate();
        model.addAttribute(Constant.CANDIDATE, candidate);  
        return Constant.CREATE_CANDIDATE_JSP;  
    }  
    
    /**
     * Recruiter entered informations are obtained as an object.
     * Then the object is passed to the DAO layer to store it in DB.
     * 
     * @param candidate - Created object.
     * @param model - Used to send candidate object along with request to jsp.
     * @return
     */
    @RequestMapping(value = Constant.SAVE_CANDIDATE, method = RequestMethod.POST)  
    private String saveCandidate(@ModelAttribute(Constant.CANDIDATE) Candidate 
            candidate, Model model) {
        try { 
        	System.out.println("Inside save method");
            candidate = candidateService.saveCandidate(candidate);
    		System.out.println("Inside controller " + candidate);
            model.addAttribute(Constant.STATUS, Constant.CREATED); 
        } catch (Exception e) {
            //logger.error(e.getMessage());
        }
        return Constant.CREATE_CANDIDATE_JSP;
    }

	
}
