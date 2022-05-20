package me.ix.NsureTechApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.ix.NsureTechApp.Translate;

@CrossOrigin
@RestController
public class TranslateController {

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = "/translate/lc={languageCode}/text={text}")
	public String getTranslation(@PathVariable("languageCode") String languageCode, 
			@PathVariable("text") String text) {
		try {
			return Translate.translate(languageCode, text);
		} catch (Exception e) {
			return "Error";
		}
	}
}
