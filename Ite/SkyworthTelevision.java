package Ite;

public class SkyworthTelevision implements Television {
	private Object[] obj= {"CCTV-1","CCTV-2","CCTV-3","CCTV-4","CCTV-5"};
	public TVIterator createIterator() {
		return new SkyworthIterator();
	}
	private class SkyworthIterator implements TVIterator {
		private int currentIndex=0;
		public void next() {
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		}
		@Override
		public void setChannel(int i) {
			// TODO 自动生成的方法存根
			currentIndex=i;
		}
		@Override
		public void previous() {
			// TODO 自动生成的方法存根
			if(currentIndex>0) {
				currentIndex--;
			}
		}
		@Override
		public boolean isLast() {
			// TODO 自动生成的方法存根
			return currentIndex==obj.length;
		}
		@Override
		public Object currentChannel() {
			// TODO 自动生成的方法存根
			return obj[currentIndex];
		}
		@Override
		public boolean isFirst() {
			// TODO 自动生成的方法存根
			return currentIndex==0;
		}
	}
}
