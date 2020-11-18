package com.bsoft.bmipsassembler.mars.mips.dump;

import com.bsoft.bmipsassembler.mars.mips.hardware.AddressErrorException;

import java.io.*;

public interface DumpFormat {

       public String getFileExtension();

       public String getDescription();

       public String getCommandDescriptor();

       public String toString();

       public void dumpMemoryRange(File file, int firstAddress, int lastAddress)
		    throws AddressErrorException, IOException;
   
   }