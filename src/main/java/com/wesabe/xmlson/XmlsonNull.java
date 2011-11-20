package com.wesabe.xmlson;

/**
 * An XMLSON null value.
 * 
 * @author coda
 */
public class XmlsonNull extends XmlsonPrimitive<Object> {
	
    public static final XmlsonNull INSTANCE = new XmlsonNull();
    
    protected XmlsonNull() {}
    
	/* (non-Javadoc)
	 * @see com.wesabe.xmlson.XmlsonPrimitive#getValue()
	 */
	@Override
	public Object getValue() {
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof XmlsonNull;
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
	
	@Override
	public String toString() {
		return "null";
	}
}
