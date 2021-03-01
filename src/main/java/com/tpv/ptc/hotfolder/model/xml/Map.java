package com.tpv.ptc.hotfolder.model.xml;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class Map {
	
	@XmlJavaTypeAdapter(Adapter.class)
	private java.util.Map<String, String> map;
	
	
	

}
