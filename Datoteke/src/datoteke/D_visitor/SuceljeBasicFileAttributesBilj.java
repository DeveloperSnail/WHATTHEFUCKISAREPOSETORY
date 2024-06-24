package datoteke.D_visitor;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

abstract class SuceljeBasicFileAttributesBilj implements BasicFileAttributes {

	public abstract FileTime lastModifiedTime();

	public abstract FileTime lastAccessTime();

	public abstract FileTime creationTime();

	public abstract boolean isRegularFile();

	public abstract boolean isDirectory();

	public abstract boolean isSymbolicLink();

	public abstract boolean isOther();

	public abstract long size();

	public abstract Object fileKey();

}
