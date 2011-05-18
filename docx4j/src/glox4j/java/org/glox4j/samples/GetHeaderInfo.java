package org.glox4j.samples;

import org.apache.log4j.Logger;
import org.docx4j.samples.AbstractSample;
import org.glox4j.openpackaging.packages.GloxPackage;

public class GetHeaderInfo extends AbstractSample {
	
	private static Logger log = Logger.getLogger(GetHeaderInfo.class);						

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		try {
			getInputFilePath(args);
		} catch (IllegalArgumentException e) {
			inputfilepath = System.getProperty("user.dir") + "/sample-docs/glox/Hier2Level.glox";
		}
		
		GloxPackage gloxPackage = GloxPackage.load(new java.io.File(inputfilepath));
		
		String title0 = gloxPackage.getDiagramLayoutHeaderPart().getJaxbElement().getTitle().get(0).getVal();
		System.out.println(title0);
		
		String desc0 = gloxPackage.getDiagramLayoutHeaderPart().getJaxbElement().getDesc().get(0).getVal();
		System.out.println(desc0);
		

	}
}