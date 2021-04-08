package net.alepuzio.provesintassi.lambda.informit;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortFiles {

	private  File[] arrayFiles;

	public SortFiles(File[] arrayFiles) {
		super();
		this.arrayFiles = arrayFiles;
	}
	
	public File[] files(){
		List<File> listFiles = 
				Arrays.asList(this.arrayFiles).stream()
		.filter(e -> e.isDirectory())
		.sorted( (a, b)-> a.getAbsolutePath().compareTo( b.getAbsolutePath() )  )
		.collect(Collectors.toList());
		return listFiles.toArray(new File[listFiles.size()]);
		//return (File[]) listFiles.toArray();
	}
}
