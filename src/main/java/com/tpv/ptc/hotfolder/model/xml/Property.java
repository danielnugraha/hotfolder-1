package com.tpv.ptc.hotfolder.model.xml;

import javax.xml.bind.annotation.XmlAttribute;

public class Property {
	
	@XmlAttribute
	private String uri;
	
	@XmlAttribute
	private String value;
	
	@XmlAttribute
	private String datatype;
	
	@XmlAttribute
	private String level;
	
	@XmlAttribute
	private String label;
	
	@XmlAttribute
	private String domainName;
	
	
	
}
