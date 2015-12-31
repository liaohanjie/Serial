

import java.util.List;

import com.core.Serializer;

/**
 * 提交战斗验证结果
 * @author hanjie.l
 *
 */
public class SubmitStageFightRequest extends Serializer{

	/**
	 * 关卡id
	 */
	public int stageId;
	
	/**
	 * 消除详细步骤记录
	 */
	public List<Step> steps;
	
	/**
	 * 获得星级
	 */
	public int star;
	
	
	/**
	 * 消除详细步骤记录
	 */
	public Step step;
	
	@Override
	protected void read() {
		this.stageId = readInt();
		this.steps = readList(Step.class);
		this.star = readInt();
		this.step = read(Step.class);
	}

	@Override
	public void write() {
		writeInt(this.stageId);
		writeList(steps);
		writeInt(this.star);
		writeObject(this.step);
	}

	@Override
	public String toString() {
		return "stageId:"+stageId + "  " + "steps:" + steps+ "  " + "star" +star + "  " + "step" + step;
	}
	
	
}