import service, { CustomSuccessData } from './request'

interface IAxiosGet {
  <T = any>(url: string, params?: Record<string, any>): Promise<CustomSuccessData<T>>
}
interface IAxiosPostOrPutOrDelete {
  <T = any>(url: string, data?: Record<string, any>): Promise<CustomSuccessData<T>>
}
const get: IAxiosGet = (url, params) => {
  return service({ url: url, method: 'GET', params: params })
}
const post: IAxiosPostOrPutOrDelete = (url, data) => {
  return service({ url: url, method: 'POST', data: data })
}
const put: IAxiosPostOrPutOrDelete = (url, data) => {
  return service({ url: url, method: 'PUT', data: data })
}
const deleteRequest: IAxiosPostOrPutOrDelete = (url, data) => {
  return service({ url: url, method: 'DELETE', data: data })
}
export default {
  get,
  post,
  put,
  delete: deleteRequest,
}
