package Test;
//�Զ����쳣�࣬�����������ָ�ʽ�쳣��
//�Զ���һ�������࣬��һ��public static int parseInt(String str)��̬����
//�ܹ����ַ���ת��Ϊ��ֵ�����أ������ת�������з��ַ������ַ������׳��Զ����쳣����
//���дһ�������࣬�����Զ��幤�����parseInt�������������쳣������
class MyTool{
	public static int Parseint(String str) throws MYException{
		int result = 0;
		int i ;
		for(i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch>='0'&&ch<='9') result = result*10+ch-'0';
			else  throw new MYException(str);
		}
		return result;
	}
}
