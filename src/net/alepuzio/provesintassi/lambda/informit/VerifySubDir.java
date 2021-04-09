package net.alepuzio.provesintassi.lambda.informit;

import java.io.File;
import java.io.FileFilter;

public class VerifySubDir {
	
	private File root;

	public VerifySubDir(File root) {
		super();
		this.root = root;
	}
	
	public File[] oldMode(){
		return this.root.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
		}});
	}
	public File[] newMode(){
		return this.root.listFiles( a -> a.isDirectory());
	}

}
