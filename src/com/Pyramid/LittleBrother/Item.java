package com.Pyramid.LittleBrother;

public class Item {
	public short id;
	public short meta = 0;
	public byte count = 1;
	public String name = "unknow";
	
	public Item(short id, short meta, byte count, String name){
		this.id = id;
		this.meta = meta;
		this.count = count;
		this.name = name;
	}
	
	/**
	 * 
	 * @param id
	 * @param meta
	 * @param count
	 * @return
	 */
	public static Item get(short id, short meta, byte count){
		return new Item(id, meta, count, "unknow");
	}
	
	/**
	 * 
	 * @return short
	 */
	public short getID(){
		return this.id;
	}
	
	/**
	 * 
	 * @return short
	 */
	public short getDamage(){
		return this.meta;
	}
	
	/**
	 * 
	 * @return byte
	 */
	public byte getCount(){
		return this.count;
	}
}
