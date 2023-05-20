package com.annotation5.javaconfigps;

// no source code
public class Library {
	private int libraryNo;
	private String libraryName;
	private int nBooks;

	public Library(int libraryNo) {
		this.libraryNo = libraryNo;
	}

	void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	void setnBooks(int nBooks) {
		this.nBooks = nBooks;
	}

	@Override
	public String toString() {
		return "Library [libraryNo=" + libraryNo + ", libraryName=" + libraryName + ", nBooks=" + nBooks + "]";
	}

}
