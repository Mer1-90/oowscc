import random, copy, os
class cloudlet:
    def __init__(self,id):
        #           //Cloudlet properties
	    #         	int id = 0;
	    #         	pesNumber=1;
	    #         	long length = 250000;
	    #         	long fileSize = 300;
	    #         	long outputSize = 300;
        self.id=1 
        self.length=1 
        self.pesNumber=1 
        self.fileSize=1 
        self.outputSize=1
        self.pt = 0
        self.cj = 0
        self.cout=0
    def update(self):
        pass
class Cromosome:
    def __init__(self):
        self.tabcj = []
        self.lstch = []
        self.get_new_cromosome()
    def get_new_cromosome(self):
        pass
    def list_fo(self):
        # star code java 
        # end code java 
        return [10,10]
    def update(self):
        pass
class population:
    def __init__(self):
        self.get_initial_population()
    def get_initial_population(self):
        pass
    def update(self):
        pass
class vm:
    def __init__(self,id):
                    # //VM description
	            	# int vmid = 0;
	            	# int mips = 250;
	            	# long size = 10000; //image size (MB)
	            	# int ram = 512; //vm memory (MB)
	            	# long bw = 1000;
	            	# int pesNumber = 1; //number of cpus
	            	# String vmm = "Xen"; //VMM name
        self.vmid = id
        self.brokerId = 0
        self.mips = 0
        self.pesNumber=0
        self.ram=0
        self.bw=0
        self.size=0
        self.vmm=0
        self.power=4
        self.power=self.calc_power()
        self.list_tach=[]
        def calc_power(self):
            s=0
            for rec in self.list_tach:
                s+=rec.pt*5
            return s

    def update(self):
        pass
class host:
    def __init__(self,id):
        #     int ram = 2048; //host memory (MB)
	    #     long storage = 1000000; //host storage
	    #     int bw = 10000;
        #     int mips = 1000;

        self.id = id
        self.ram=0
        self.bw=0
        self.storage = 0
        self.peList = 0
        self.mips=0
    def update(self):
        pass
class Datacenter:
    def __init__(self,id):
        #     String arch = "x86";      // system architecture
	    #     String os = "Linux";          // operating system
	    #     String vmm = "Xen";
	    #     double time_zone = 10.0;         // time zone this resource located
	    #     double cost = 3.0;              // the cost of using processing in this resource
	    #     double costPerMem = 0.05;		// the cost of using memory in this resource
	    #     double costPerStorage = 0.001;	// the cost of using storage in this resource
	    #     double costPerBw = 0.0;			// the cost of using bw in this resource
        self.id=0
        self.arch=0
        self.vos=0
        self.vmm=0
        self.hostList=0
        self.time_zone=0
        self.cost=0
        self.costPerMem=0,
        self.costPerStorage=0
        self.costPerBw=0
    def update(self):
        pass