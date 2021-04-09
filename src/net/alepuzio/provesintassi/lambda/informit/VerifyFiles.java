package net.alepuzio.provesintassi.lambda.informit;

import java.io.File;
import java.io.FilenameFilter;

public class VerifyFiles {
	private File root;

	public VerifyFiles(File root) {
		super();
		this.root = root;
	}

	public File[] oldMode() {
		return this.root.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return goodSubDir(dir) && goodFile(name);
			}
		});
	}

	public File[] newMode() {
		return this.root.listFiles((dir, name) -> goodSubDir(dir) && goodFile(name));
	}

	private boolean goodSubDir(File dir) {
		return dir.getName().contains(EnumVerify.SUBDIR.value());
	}

	private boolean goodFile(String fileName) {
		return fileName.endsWith(EnumVerify.EXTENSION_FILE.value());
	}
}

enum EnumVerify {

	SUBDIR("1"), EXTENSION_FILE(".TXT");

	private String value;

	private EnumVerify(String newValue) {
		this.value = newValue;
	}

	public String value() {
		return value;
	}
}