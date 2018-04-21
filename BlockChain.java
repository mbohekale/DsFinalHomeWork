public class BlockChain {

	public static void main(String[] args) {
		
		Block genesisBlock = new Block("Welcome to BLOCKcHAI", "0");
		System.out.println("Hash for block 1 : " + genesisBlock.hash);
		
		Block secondBlock = new Block("EKALE im the second block",genesisBlock.hash);
		System.out.println("Hash for block 2 : " + secondBlock.hash);
		
		Block thirdBlock = new Block("MBOH im the third block",secondBlock.hash);
		System.out.println("Hash for block 3 : " + thirdBlock.hash);
		
		Block forthBlock = new Block("Charles im the forth block",thirdBlock.hash);
		System.out.println("Hash for block 4 : " + forthBlock.hash);
		
		Block fifthBlock = new Block("Ekale im the fifth block",forthBlock.hash);
		System.out.println("Hash for block 5 : " + fifthBlock.hash);
		
		Block sixthBlock = new Block("Jesus im the Sixth block",fifthBlock.hash);
		System.out.println("Hash for block 6 : " + sixthBlock.hash);
		
	}
}