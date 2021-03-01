package com.tpv.ptc.hotfolder.model.xml;

import javax.xml.bind.annotation.XmlAttribute;


public class Entry {
	
	@XmlAttribute
	public String cmsLabel;
	@XmlAttribute
	public String ptcName;
	
	public Entry(String cmsLabel, String ptcName) {
		this.cmsLabel = cmsLabel;
		this.ptcName = ptcName;
	}
	
	public Entry() {
		
	}
	
}
