package com.tpv.ptc.hotfolder.model.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Metadata {

	@XmlElement
	public List<Property> properties;
	
}
