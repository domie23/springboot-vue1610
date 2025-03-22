const base = {
    get() {
                return {
            url : "http://localhost:8080/ssms95f7/",
            name: "ssms95f7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssms95f7/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "农家乐管理系统"
        } 
    }
}
export default base
