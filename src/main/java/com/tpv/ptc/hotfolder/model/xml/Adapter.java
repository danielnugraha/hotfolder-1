package com.tpv.ptc.hotfolder.model.xml;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter extends XmlAdapter<Entry[], java.util.Map<String, String>> {

	@Override
	public Map<String, String> unmarshal(Entry[] v) throws Exception {
		Map<String, String> ret = new HashMap<>();
		for(Entry entry : v) {
			if(ret.get(entry.cmsLabel)==null) {
				ret.put(entry.cmsLabel, entry.ptcName);
			} else {
				//should throw an error
			}
			
		}
		return ret;
	}

	@Override
	public Entry[] marshal(Map<String, String> v) throws Exception {
		Entry[] ret = new Entry[v.size()];
		int index = 0;
		for(Map.Entry<String, String> entry : v.entrySet()) {
			ret[index] = new Entry(entry.getKey(), entry.getValue());
			index++;
		}
		return ret;
	}

	

}
