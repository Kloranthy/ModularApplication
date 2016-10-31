package edu.kvcc.cis298.weigel.module.application.file;
import java.io.File;

public interface FileModule
{
	public File loadFile( String fileName );

	public void overwriteFile( String fileName, String contents );
	// todo add more from hs/de
}
