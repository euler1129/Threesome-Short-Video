import request from '@/utils/requestMethod'
import { ILogin, ILoginParams } from '@/models/login'

export const signIn = (form: ILoginParams) => request.post<ILogin>('/api/auth/token', form)
