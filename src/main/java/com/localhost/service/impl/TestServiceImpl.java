package com.localhost.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.localhost.dao.ITestDao;
import com.localhost.model.User;
import com.localhost.service.ITestService;

public class TestServiceImpl implements ITestService {
	private ITestDao testDao;
	private static int count = 0;

	public ITestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(ITestDao testDao) {
		this.testDao = testDao;
	}

	public void testProcess() throws Exception {
//		System.out.println("test");
//
//		List<Test> testList = testDao.findAll();
//		int threadNumber = 10;
//		final CountDownLatch countDownLatch = new CountDownLatch(threadNumber);
//		final List<String> testList1 = new ArrayList<String>();
//		for (int i = 0; i < threadNumber; i++) {
//			final int threadID = i;
//			System.out.println(i);
//			new Thread() {
//				public void run() {
//					List<String> test2 = new ArrayList<String>();
//
//					try {
//						for (int x = threadID * 1000; x < (threadID + 1) * 1000; x++) {
//							test2.add("threadID:[" + threadID + "]" + x);
//						}
//						Thread.sleep((long) (Math.random() * 10000));
//
//						testList1.addAll(test2);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(String.format("threadID:[%s] finished!!", threadID));
//					System.out.println(String.format("threadID:[%s] list:" + test2.size(), threadID));
//					count = count + 1;
//					System.out.println(count);
//					countDownLatch.countDown();
//				}
//			}.start();
//		}
//		countDownLatch.await();
//
//		File file = new File("/home/zipe/tmp/test.txt");
//
//		FileWriter fileWriter = new FileWriter(file, true);
//		for (Test test : testList) {
//
//			try {
//				fileWriter.append("OID : " + test.getOid() + " IP : " + test.getIp() + "\n");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//		fileWriter.close();
	}

}
