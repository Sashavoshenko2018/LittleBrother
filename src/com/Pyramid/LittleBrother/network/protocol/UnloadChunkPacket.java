package com.Pyramid.LittleBrother.network.protocol;

class UnloadChunkPacket extends DataPacket{
	public int chunkX;
	public int chunkZ;
	
	public byte pid(){
		return Info.UNLOAD_CHUNK_PACKET;
	}

	public void decode(){

	}

	public void encode(){
	    this.reset();
            this.putInt(chunkX);
	    this.putInt(chunkZ);
		
	}

}
