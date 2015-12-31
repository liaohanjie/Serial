import com.core.Serializer;


/**
 * 消除动作
 * (描述消除X方块Y个)
 * @author hanjie.l
 *
 */
public class Remove extends Serializer{
	
	public Remove() {
	}
	
	public Remove(int objectId, int num){
		this.objectId = objectId;
		this.num = num;
	}
	
	/**
	 * 物品id
	 */
	private int objectId;
	
	/**
	 * 数量
	 */
	private int num;

	public int getObjectId() {
		return objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	protected void read() {
		this.objectId = readInt();
		this.num = readInt();
	}
	

	@Override
	public void write() {
		writeInt(this.objectId);
		writeInt(this.num);
	}
}
